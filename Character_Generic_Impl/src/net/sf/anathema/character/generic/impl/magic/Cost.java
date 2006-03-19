package net.sf.anathema.character.generic.impl.magic;

import net.sf.anathema.character.generic.magic.general.ICost;

public class Cost implements ICost {

  public static final ICost NULL_COST = new Cost("0", ""); //$NON-NLS-1$ //$NON-NLS-2$
  private final String text;
  private final String costString;

  public Cost(String costString, String text) {
    this.costString = costString;
    this.text = text;
  }

  public String getCost() {
    return costString;
  }

  public String getText() {
    return text;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Cost)) {
      return false;
    }
    Cost other = (Cost) obj;
    return other.costString.equals(this.costString) && other.text.equals(this.text);
  }

  @Override
  public int hashCode() {
    return text.hashCode() + 37 * costString.hashCode();
  }
}