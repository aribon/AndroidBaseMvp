package me.aribon.basemvp.exception;

import me.aribon.basemvp.presenter.BasePresenter;

/**
 * Created on 20/06/2016
 *
 * @author aribon
 */
public class NotAttachedViewException extends Exception {

    public static final String DEFAULT_MESSAGE = "Not attached view exception. Please use the " + BasePresenter.class.getName() + "::onAttachView() method.";

    public NotAttachedViewException() {
        super(DEFAULT_MESSAGE);
    }

    public NotAttachedViewException(String detailMessage) {
        super(detailMessage);
    }
}