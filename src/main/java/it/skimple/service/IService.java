package it.skimple.service;

import it.skimple.entity.BaseEntity;

public interface IService<T extends BaseEntity> {

//	public T get(T t);

	public T get(long id);
	
	public T save(T t);
}
