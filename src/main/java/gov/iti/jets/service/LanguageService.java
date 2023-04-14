package gov.iti.jets.service;

import gov.iti.jets.dto.LanguageDto;
import gov.iti.jets.entity.Language;
import gov.iti.jets.mapper.LanguageMapper;

public class LanguageService extends BaseServiceImpl<Language, LanguageDto, Short>{

    private static  volatile LanguageService languageService;

    private LanguageService()
    {
        super(Language.class, LanguageMapper.class);
    }
    public static LanguageService getInstance()
    {
        if(languageService == null)
        {
            synchronized (LanguageService.class)
            {
                if(languageService == null)
                {
                    languageService = new LanguageService();
                }
            }
        }
        return  languageService;
    }


}
