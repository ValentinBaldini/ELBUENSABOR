package com.elbuensabor.app.config;

import com.elbuensabor.app.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
        // Aquí puedes agregar lógica personalizada si lo necesitas
    }
}
