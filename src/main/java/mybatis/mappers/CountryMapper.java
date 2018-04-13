package mybatis.mappers;

import mybatis.entity.Country;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CountryMapper extends Mapper<Country>, MySqlMapper<Country> {
}