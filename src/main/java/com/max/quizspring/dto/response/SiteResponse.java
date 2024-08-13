package com.max.quizspring.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SiteResponse {
    private Long wid;
    private String siteEmail;
    private String siteContact;
    private String siteAddress;
    private String siteX;
    private String siteYoutube;
    private String siteFacebook;
    private boolean siteMaintenanceMode;
}
