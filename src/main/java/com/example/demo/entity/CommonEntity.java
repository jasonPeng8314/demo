package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class CommonEntity<ID extends Serializable> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected ID id;
}







