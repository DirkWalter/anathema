package net.sf.anathema.charmentry.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.sf.anathema.character.generic.impl.rules.ExaltedEdition;
import net.sf.anathema.character.generic.rules.IExaltedEdition;
import net.sf.anathema.character.generic.type.CharacterType;
import net.sf.anathema.character.generic.type.ICharacterType;
import net.sf.anathema.charmentry.model.data.IConfigurableCharmData;
import net.sf.anathema.charmentry.presenter.model.ISourceEntryModel;
import net.sf.anathema.lib.control.change.ChangeControl;
import net.sf.anathema.lib.control.change.IChangeListener;
import net.sf.anathema.lib.control.objectvalue.IObjectValueChangedListener;
import net.sf.anathema.lib.gui.wizard.workflow.CheckInputListener;
import net.sf.anathema.lib.workflow.textualdescription.ITextualDescription;

public class HeaderDataModel implements IHeaderDataModel {
  private final ISourceEntryModel sourceModel;
  private final ChangeControl control = new ChangeControl();
  private final IConfigurableCharmData charmData;

  public HeaderDataModel(final IConfigurableCharmData charmData) {
    this.charmData = charmData;
    this.sourceModel = new SourceEntryModel(charmData);
    charmData.getName().addTextChangedListener(new IObjectValueChangedListener<String>() {
      public void valueChanged(String newValue) {
        final ICharacterType type = charmData.getCharacterType();
        if (type != null) {
          charmData.setId(CharmIdGenerator.createIDFromName(type, newValue));
        }
      }
    });
  }

  public ICharacterType[] getCharacterTypes() {
    List<ICharacterType> legalTypes = new ArrayList<ICharacterType>();
    Collections.addAll(legalTypes, CharacterType.getAllExaltTypes());
    legalTypes.remove(CharacterType.SIDEREAL);
    return legalTypes.toArray(new ICharacterType[legalTypes.size()]);
  }

  public IExaltedEdition[] getEditions() {
    return ExaltedEdition.values();
  }

  public ISourceEntryModel getSourceModel() {
    return sourceModel;
  }

  public ICharacterType getCharacterType() {
    return charmData.getCharacterType();
  }

  public IExaltedEdition getEdition() {
    return charmData.getEdition();
  }

  public ITextualDescription getName() {
    return charmData.getName();
  }

  public void setCharacterType(ICharacterType type) {
    charmData.setCharacterType(type);
    final String text = charmData.getName().getText();
    if (text != null) {
      charmData.setId(CharmIdGenerator.createIDFromName(type, text));
    }
    control.fireChangedEvent();
  }

  public void setExaltedEdition(IExaltedEdition edition) {
    charmData.setEdition(edition);
    control.fireChangedEvent();
  }

  public void addModelListener(CheckInputListener inputListener) {
    control.addChangeListener(inputListener);
    charmData.getName().addTextChangedListener(inputListener);
  }

  public void addChangeListener(IChangeListener inputListener) {
    control.addChangeListener(inputListener);
  }
}