/*
 * Copyright (c) 2008 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.

 * Author: Konstantin Krivopustov
 * Created: 28.07.2009 10:45:34
 *
 * $Id$
 */
package com.haulmont.cuba.security.listener;

import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.haulmont.cuba.security.entity.User;

public class UserEntityListener implements
        BeforeInsertEntityListener<User>, BeforeUpdateEntityListener<User>
{
    public void onBeforeInsert(User entity) {
        entity.setLoginLowerCase(entity.getLogin() != null ? entity.getLogin().toLowerCase() : null);
    }

    public void onBeforeUpdate(User entity) {
        entity.setLoginLowerCase(entity.getLogin() != null ? entity.getLogin().toLowerCase() : null);
    }
}
