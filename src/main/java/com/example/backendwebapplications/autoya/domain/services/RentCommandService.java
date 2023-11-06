package com.example.backendwebapplications.autoya.domain.services;

import com.example.backendwebapplications.autoya.domain.model.commands.CancelRentCommand;
import com.example.backendwebapplications.autoya.domain.model.commands.ConfirmRentCommand;

public interface RentCommandService {
    Long handle(CancelRentCommand command, Long vehicleId);
    Long handle(ConfirmRentCommand command, Long vehicleId);
}
