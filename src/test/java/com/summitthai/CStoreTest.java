package com.summitthai;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CStoreTest {
    @Mock
    BankingService bankingService;

    @Test
    public void deposit49999WithDepositOfTheseDay0ShouldBeOk() {
        // Arrange
        String expectedResult = "OK";
        String accountNumber = "7321239875";
        when(bankingService.getDepositOfTheseDay(accountNumber)).thenReturn(0);
        CStore cStore = new CStore(bankingService);

        // Act
        String actualResult = cStore.deposit(accountNumber, 49999);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit50000WithDepositOfTheseDay0ShouldBeOk() {
        // Arrange
        String expectedResult = "OK";
        String accountNumber = "7321239875";
        when(bankingService.getDepositOfTheseDay(accountNumber)).thenReturn(0);
        CStore cStore = new CStore(bankingService);

        // Act
        String actualResult = cStore.deposit(accountNumber, 50000);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit50001WithDepositOfTheseDay0ShouldBeNo() {
        // Arrange
        String expectedResult = "NO";
        String accountNumber = "7321239875";
        when(bankingService.getDepositOfTheseDay(accountNumber)).thenReturn(0);
        CStore cStore = new CStore(bankingService);

        // Act
        String actualResult = cStore.deposit(accountNumber, 50001);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_100_WithDepositOfTheseDay_49899_ShouldBeOK() {
        // Arrange
        String expectedResult = "OK";
        String accountNumber = "7321239875";
        when(bankingService.getDepositOfTheseDay(accountNumber)).thenReturn(49899);
        CStore cStore = new CStore(bankingService);

        // Act
        String actualResult = cStore.deposit(accountNumber, 100);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_100_WithDepositOfTheseDay_49900_ShouldBeOK() {
        // Arrange
        String expectedResult = "OK";
        String accountNumber = "7321239875";
        when(bankingService.getDepositOfTheseDay(accountNumber)).thenReturn(49900);
        CStore cStore = new CStore(bankingService);

        // Act
        String actualResult = cStore.deposit(accountNumber, 100);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deposit_100_WithDepositOfTheseDay_49901_ShouldBeNO() {
        // Arrange
        String expectedResult = "NO";
        String accountNumber = "7321239875";
        when(bankingService.getDepositOfTheseDay(accountNumber)).thenReturn(49901);
        CStore cStore = new CStore(bankingService);

        // Act
        String actualResult = cStore.deposit(accountNumber, 100);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
