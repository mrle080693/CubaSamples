package com.company.cubasamples.core.access_group;

import com.haulmont.chile.core.model.Session;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.app.group.AnnotatedAccessGroupDefinition;
import com.haulmont.cuba.security.app.group.annotation.AccessGroup;
import com.haulmont.cuba.security.app.group.annotation.Constraint;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.entity.Role;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.group.AccessGroupDefinition;
import org.eclipse.persistence.sessions.factories.SessionFactory;

import javax.inject.Inject;
import java.util.Collection;
import java.util.List;

//@AccessGroup(name = "Roles", parent = AccessGroupDefinition.class)
public class RoleAccessGroup extends AnnotatedAccessGroupDefinition {

    @Inject
    private UserSessionSource userSessionSource;

    /*
    @Constraint(operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    public boolean orderConstraints(Role role) {
        //System.out.println("1" + role.getName());
        //System.out.println("1" + role.getName());

        return userSessionSource.getUserSession().getRoles().contains(role.getName());
    }
    */
}
