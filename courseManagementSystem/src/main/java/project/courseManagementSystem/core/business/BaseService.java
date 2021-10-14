package project.courseManagementSystem.core.business;

import java.util.List;

import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;

public interface BaseService<T> {
	public Result add(T entity);
	public Result delete(T entity);
	public Result update(T entity);
	public DataResult<T> getById(int id);
	public DataResult<List<T>> getAll();
}