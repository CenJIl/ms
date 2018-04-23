package mybatis.service;

import mybatis.entity.Country;
import mybatis.mappers.CountryMapper;
import mybatis.serviceImp.CountryServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CountryService implements CountryServiceI {

    @Autowired
    private CountryMapper mapper;


    public void add(Country country) {
        mapper.insertSelective(country);


    }
}
