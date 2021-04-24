package com.ecnu.petHospital.session;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class UserSessionInfo {

    private Integer id;

    private String username;

    private String email;

    private Boolean admin;
}
