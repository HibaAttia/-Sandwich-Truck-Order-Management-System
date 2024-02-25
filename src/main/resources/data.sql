INSERT INTO USER
(id, username, password, role)
VALUES
    (1,
     'admin@admin.com',
     '$2a$10$pb/kanBFe.W3m5f69lmmTuK0tiJx9G0ayOmk5UMWFz.bw3mLWkN6e',/*123456*/
     'ADMIN',
    )ON CONFLICT DO NOTHING ;

INSERT INTO USER
(id, username, password, role)
VALUES
    (1,
     'user@user.com',
     '$2a$10$pb/kanBFe.W3m5f69lmmTuK0tiJx9G0ayOmk5UMWFz.bw3mLWkN6e',/*123456*/
     'USER',
    )ON CONFLICT DO NOTHING ;