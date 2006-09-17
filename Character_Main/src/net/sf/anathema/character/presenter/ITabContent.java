package net.sf.anathema.character.presenter;

import net.sf.anathema.framework.presenter.view.IMultiTabView;
import net.sf.anathema.lib.gui.IDisposable;

public interface ITabContent {

  public abstract void addTo(IMultiTabView view);

  public abstract IDisposable getDisposable();

}