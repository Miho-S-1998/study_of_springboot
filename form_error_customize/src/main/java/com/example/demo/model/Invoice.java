package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Invoice {

@NotBlank
@Size(max=60)
private String name;

@NotBlank
@Size(max=254)
private String address;

@NotBlank
@Pattern(regexp="[0-9-]*")
private String phoneNumber;

@Nonnull
@Min(1000)
@NumberFormat(pattern="#,###") //数値に変換
private BigDecimal price;

@NotNull
@DateTimeFormat(iso=ISO.DATE)　//日付へ変換
private LocalDate paymentDeadline;
}
