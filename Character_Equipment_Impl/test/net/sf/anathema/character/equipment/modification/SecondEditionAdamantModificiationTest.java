package net.sf.anathema.character.equipment.modification;

import net.sf.anathema.character.equipment.MagicalMaterial;
import net.sf.anathema.character.equipment.impl.character.model.stats.modification.WeaponStatsType;
import net.sf.anathema.character.generic.health.HealthType;
import net.sf.anathema.character.generic.impl.rules.ExaltedRuleSet;
import net.sf.anathema.character.generic.rules.IExaltedRuleSet;
import org.junit.Test;

public class SecondEditionAdamantModificiationTest extends AbstractEquipmentModificationTest {

  @Test
  public void accuracyUnmodified() throws Exception {
    assertAccuracyUnmodified();
  }

  @Test
  public void unmodifiedDefense() throws Exception {
    assertDefenseUnmodified();
  }

  @Test
  public void damageUnmodified() throws Exception {
    assertDamageUnmodified();
  }

  @Test
  public void unmodifiedSpeed() {
    assertSpeedUnmodified();
  }

  @Test
  public void rateUnmodified() {
    assertRateUnmodified();
  }

  @Test
  public void unmodifiedRange() {
    assertRangeUnmodified();
  }

  @Test
  public void lethalSoakIncreasedBy3() {
    assertSoakModification(4, 1, HealthType.Lethal);
  }

  @Test
  public void bashingSoakUnmodified() {
    assertSoakModification(1, 1, HealthType.Bashing);
  }

  @Test
  public void aggravatedSoakUnmodified() {
    assertSoakModification(1, 1, HealthType.Aggravated);
  }

  @Test
  public void hardnessUnmodified() {
    assertHardnessUnmodified();
  }

  @Test
  public void mobilityDecreasedByOne() {
    assertMobilityPenaltyModification(1, 2);
  }

  @Test
  public void fatigueUnmodified() {
    assertFatigueUnmodified();
  }

  @Override
  protected MagicalMaterial getMagicMaterial() {
    return MagicalMaterial.Adamant;
  }

  @Override
  protected IExaltedRuleSet getRuleSet() {
    return ExaltedRuleSet.SecondEdition;
  }
}