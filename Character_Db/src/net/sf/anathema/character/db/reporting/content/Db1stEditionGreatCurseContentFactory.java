package net.sf.anathema.character.db.reporting.content;

import net.sf.anathema.character.generic.character.IGenericCharacter;
import net.sf.anathema.character.generic.character.IGenericDescription;
import net.sf.anathema.character.reporting.pdf.content.RegisteredReportContent;
import net.sf.anathema.character.reporting.pdf.content.ReportContentFactory;
import net.sf.anathema.lib.resources.IResources;

@RegisteredReportContent(produces = Db1stEditionGreatCurseContent.class)
public class Db1stEditionGreatCurseContentFactory implements ReportContentFactory<Db1stEditionGreatCurseContent> {

  private IResources resources;

  public Db1stEditionGreatCurseContentFactory(IResources resources) {
    this.resources = resources;
  }

  @Override
  public Db1stEditionGreatCurseContent create(IGenericCharacter character, IGenericDescription description) {
    return new Db1stEditionGreatCurseContent(resources, character);
  }
}
