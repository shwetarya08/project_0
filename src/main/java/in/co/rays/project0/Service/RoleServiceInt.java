package in.co.rays.project0.Service;

import java.util.List;

import in.co.rays.project0.DTO.RoleDTO;
import in.co.rays.project0.Exception.DuplicateRecordException;

/**
 * Role Service interface.
 * 
 * @author FrontController
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public interface RoleServiceInt {
	/**
     * Adds a Role.
     * 
     * @param dto
     * @return
     * @throws DuplicateRecordException
     */
    public long add(RoleDTO dto) throws DuplicateRecordException;

    /**
     * Updates a Role.
     * 
     * @param dto
     * @throws DuplicateRecordException
     */
    public void update(RoleDTO dto) throws DuplicateRecordException;

    /**
     * Deletes a Role
     * 
     * @param id
     */
    public void delete(long id);

    /**
     * Finds a Role by name.
     * 
     * @param roleName
     * @return
     */
    public RoleDTO findByName(String roleName);

    /**
     * Finds a Role by ID
     * 
     * @param id
     * @return
     */
    public RoleDTO findById(long id);

    /**
     * Searches Roles with pagination.
     * 
     * @param dto
     * @param pageNo
     * @param pageSize
     * @return
     */
    public List search(RoleDTO dto, int pageNo, int pageSize);

    /**
     * Searches Roles
     * 
     * @param dto
     * @return
     */
    public List search(RoleDTO dto);

}
