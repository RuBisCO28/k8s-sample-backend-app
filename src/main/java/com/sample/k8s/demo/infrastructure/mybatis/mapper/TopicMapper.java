package com.sample.k8s.demo.infrastructure.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.builder.annotation.ProviderMethodResolver;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

@Mapper
public interface TopicMapper {
  @SelectProvider(TagSqlBuilder.class)
  List<String> findAll();

  class TagSqlBuilder implements ProviderMethodResolver {
    public String findAll() {
      return new SQL() {{
        SELECT("title");
        FROM("topics");
      }}.toString();
    }
  }
}

