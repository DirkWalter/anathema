package net.sf.anathema.character.reporting.pdf.rendering.boxes.magic;

import net.sf.anathema.character.reporting.pdf.content.ReportContent;
import net.sf.anathema.character.reporting.pdf.content.magic.GenericCharmContent;
import net.sf.anathema.character.reporting.pdf.rendering.boxes.EncodingMetrics;
import net.sf.anathema.character.reporting.pdf.rendering.boxes.PreferredHeight;
import net.sf.anathema.character.reporting.pdf.rendering.page.IVoidStateFormatConstants;

public class PreferredGenericCharmHeight implements PreferredHeight {

  private static final float PADDING = 5.794f;

  @Override
  public float getValue(EncodingMetrics metrics, float width) {
    GenericCharmContent content = createContent(metrics.getContent());
    if (!content.hasContent()) {
      return 0;
    }
    return getPreferredContentHeight(metrics);
  }

  private float getPreferredContentHeight(EncodingMetrics metrics) {
    GenericCharmContent content = createContent(metrics.getContent());
    float traitHeight = 0;
    for (String traitLabel : content.getTraitLabels()) {
      float height = metrics.getTextMetrics().getTableTextWidth(traitLabel) + PADDING;
      if (height > traitHeight) {
        traitHeight = height;
      }
    }
    return traitHeight + content.getGenericCharmCount() * IVoidStateFormatConstants.LINE_HEIGHT;
  }

  private GenericCharmContent createContent(ReportContent content) {
    return content.createSubContent(GenericCharmContent.class);
  }
}
