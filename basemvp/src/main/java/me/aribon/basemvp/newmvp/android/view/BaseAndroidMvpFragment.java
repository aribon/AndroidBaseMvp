package me.aribon.basemvp.newmvp.android.view;

import android.content.Context;

import me.aribon.basemvp.newmvp.android.base.BaseFragment;
import me.aribon.basemvp.newmvp.android.presenter.AndroidMvpPresenter;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public abstract class BaseAndroidMvpFragment<P extends AndroidMvpPresenter> extends BaseFragment
    implements AndroidMvpView<P> {

  private P mPresenter;

  @Override
  public void setMvpPresenter(P mvpPresenter) {
    this.mPresenter = mvpPresenter;
  }

  @Override
  public P getMvpPresenter() {
    return mPresenter;
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
  }

  @Override
  public void onDetach() {
    mPresenter.detachMvpView();
    super.onDetach();
  }
}