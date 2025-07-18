package com.blockchain.csr.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Integer id;
    private String username;
    private String role;
    private String location;
    private String nickname;
    private String realName;
    private String gender;
    private Integer reviewerId;
    private String reviewerName;
    private String createTime;
    private Integer eventCount;
    private Integer activityCount;
} 