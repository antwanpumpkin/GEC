package com.gac.core.mappeur;

import org.mapstruct.Mapper;

import com.gac.api.modele.dto.v1.UserInfosDTO;
import com.gac.modele.persistance.Users;

@Mapper(componentModel = "spring")
public interface UserMappeur {
	Users sourceToDestination(UserInfosDTO user);
	UserInfosDTO destinationTosource(Users user);
}
