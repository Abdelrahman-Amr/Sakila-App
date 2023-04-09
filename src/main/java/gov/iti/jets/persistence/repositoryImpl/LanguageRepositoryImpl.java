package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Language;
import gov.iti.jets.persistence.repository.LanguageRepository;
import gov.iti.jets.util.MyLocal;

public class LanguageRepositoryImpl extends BaseRepositoryImpl<Language, Short> implements LanguageRepository {

    public LanguageRepositoryImpl()
    {
        super(Language.class, MyLocal.getInstance().get());
    }

}
