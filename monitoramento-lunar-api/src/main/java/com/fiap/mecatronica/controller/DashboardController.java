package com.fiap.mecatronica.controller;

import com.fiap.mecatronica.dto.ApiResponse;
import com.fiap.mecatronica.dto.DashboardDTO;
import com.fiap.mecatronica.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DashboardController {

    private final DashboardService dashboardService;

    // GET /api/dashboard
    @GetMapping
    public ResponseEntity<ApiResponse<DashboardDTO>> getDashboard() {
        return ResponseEntity.ok(ApiResponse.ok(dashboardService.gerarDashboard()));
    }
}
