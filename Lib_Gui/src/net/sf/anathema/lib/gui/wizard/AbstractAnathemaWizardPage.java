package net.sf.anathema.lib.gui.wizard;

public abstract class AbstractAnathemaWizardPage implements IAnathemaWizardPage {

  public boolean canFlipToNextPage() {
    return getNextPage() != null;
  }

  public String getTitle() {
    return getDescription();
  }

  public void performHelp() {
    //Nothing to do
  }

  public boolean isHelpAvailable() {
    return false;
  }
}