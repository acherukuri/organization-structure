package org.javers.organization.structure.domain;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@JaversSpringDataAuditable
public interface HierarchyRepository extends CrudRepository<Hierarchy, String> {
}