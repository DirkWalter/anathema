package net.sf.anathema.character.reporting.pdf.layout.extended;

import com.lowagie.text.pdf.BaseFont;
import net.sf.anathema.character.reporting.pdf.rendering.general.box.ContentEncoder;
import net.sf.anathema.character.reporting.pdf.rendering.general.box.IVariableBoxContentEncoder;
import net.sf.anathema.character.reporting.pdf.rendering.page.PageEncoder;
import net.sf.anathema.character.reporting.pdf.rendering.page.PdfPageConfiguration;
import net.sf.anathema.lib.resources.IResources;

public abstract class AbstractFirstEditionPartEncoder implements IExtendedPartEncoder {

  private final IResources resources;
  private final BaseFont baseFont;

  protected AbstractFirstEditionPartEncoder(IResources resources, BaseFont baseFont) {
    this.resources = resources;
    this.baseFont = baseFont;
  }

  public final IResources getResources() {
    return resources;
  }

  public final BaseFont getBaseFont() {
    return baseFont;
  }

  @Override
  public ContentEncoder getHealthEncoder() {
    return null;
  }

  @Override
  public ContentEncoder getMovementEncoder() {
    return null;
  }

  @Override
  public IVariableBoxContentEncoder[] getAdditionalFirstPageEncoders() {
    return new IVariableBoxContentEncoder[0];
  }

  @Override
  public PageEncoder[] getAdditionalPages(PdfPageConfiguration configuration) {
    return new PageEncoder[0];
  }
}
