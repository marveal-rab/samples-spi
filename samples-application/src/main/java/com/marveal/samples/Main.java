package com.marveal.samples;

import java.util.ServiceLoader;

public class Main {
  public static void main(String[] args) {
    ServiceLoader.load(InternetService.class).forEach(InternetService::connect);
  }
}