package net.sf.anathema.character.generic.impl.magic.test;

import net.sf.anathema.character.generic.magic.ICharm;
import net.sf.anathema.character.generic.magic.IMartialArtsCharm;
import net.sf.anathema.character.generic.magic.charms.CharmType;
import net.sf.anathema.character.generic.magic.charms.ComboRestrictions;
import net.sf.anathema.character.generic.magic.charms.DurationType;
import net.sf.anathema.character.generic.magic.charms.IComboRestrictions;
import net.sf.anathema.character.generic.magic.charms.MartialArtsLevel;
import net.sf.anathema.character.generic.traits.IGenericTrait;

public class DummyMartialArtsCharm extends DummyCharm implements IMartialArtsCharm {

  private MartialArtsLevel martialArtsLevel = MartialArtsLevel.Celestial;
  private boolean isFormCharm = false;

  public DummyMartialArtsCharm(DurationType durationType, CharmType charmType) {
    this(durationType, charmType, new ComboRestrictions());
  }

  public DummyMartialArtsCharm(String id) {
    super(id);
  }

  public DummyMartialArtsCharm(String id, ICharm[] parents) {
    super(id, parents);
  }

  public DummyMartialArtsCharm(String id, IGenericTrait[] prerequisites) {
    this(id, new ICharm[0], prerequisites);
  }

  public DummyMartialArtsCharm(String id, ICharm[] parents, IGenericTrait[] prerequisites) {
    super(id, parents, prerequisites);
  }

  public DummyMartialArtsCharm(DurationType durationType, CharmType charmType, IComboRestrictions comboRestrictions) {
    this(durationType, charmType, comboRestrictions, null);
  }

  public DummyMartialArtsCharm(
      DurationType durationType,
      CharmType charmType,
      IComboRestrictions comboRestrictions,
      IGenericTrait[] prerequisites) {
    super(durationType, charmType, comboRestrictions, prerequisites);
  }

  public MartialArtsLevel getLevel() {
    return martialArtsLevel;
  }

  public boolean isFormCharm() {
    return isFormCharm;
  }

  public void setFormCharm(boolean isFormCharm) {
    this.isFormCharm = isFormCharm;
  }

  public void setMartialArtsLevel(MartialArtsLevel martialArtsLevel) {
    this.martialArtsLevel = martialArtsLevel;
  }
}