package net.sf.anathema.character.solar.reporting;

import net.sf.anathema.character.reporting.pdf.layout.simple.AbstractSimplePartEncoder;
import net.sf.anathema.character.reporting.pdf.rendering.general.box.ContentEncoder;
import net.sf.anathema.lib.resources.IResources;

public class Simple1stEditionSolarPartEncoder extends AbstractSimplePartEncoder {

  public Simple1stEditionSolarPartEncoder(IResources resources) {
    super(resources);
  }

  public ContentEncoder getGreatCurseEncoder() {
    return new SolarVirtueFlawContentBoxEncoder();
  }

  @Override
  public ContentEncoder getAnimaEncoder() {
    return new SolarAnimaEncoderFactory(getResources()).createAnimaEncoder();
  }
}
