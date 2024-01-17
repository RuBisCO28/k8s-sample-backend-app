package com.sample.k8s.demo.domain.service;

import com.sample.k8s.demo.infrastructure.mybatis.mapper.TopicMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicService {
  private final TopicMapper topicMapper;

  @Transactional
  public List<String> findAll() {
    return topicMapper.findAll();
  }
}
