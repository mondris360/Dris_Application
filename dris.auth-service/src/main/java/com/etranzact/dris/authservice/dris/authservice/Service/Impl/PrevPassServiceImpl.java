package com.etranzact.dris.authservice.dris.authservice.Service.Impl;

import com.etranzact.dris.authservice.dris.authservice.Dto.ChangePassRequestDto;
import com.etranzact.dris.authservice.dris.authservice.Service.PrevPassService;
import com.etranzact.dris.authservice.dris.authservice.Util.Api.Response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrevPassServiceImpl implements PrevPassService {

    @Override
    public ResponseEntity<ApiResponse> changePassword(ChangePassRequestDto requestDto) {
        return null;
    }
}
