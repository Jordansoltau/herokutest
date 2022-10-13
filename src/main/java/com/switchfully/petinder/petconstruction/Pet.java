package com.switchfully.petinder.petconstruction;

public class Pet {
 private final int id;
 private final String name;
 private final Kind kindOfPet;
 private final String profileText;

 public Pet(int id, String name, Kind kindOfPet, String profileText) {
  this.id = id;
  this.name = name;
  this.kindOfPet = kindOfPet;
  this.profileText = profileText;
 }

 public int getId() {
  return id;
 }

 public String getName() {
  return name;
 }

 public Kind getKindOfPet() {
  return kindOfPet;
 }

 public String getProfileText() {
  return profileText;
 }
}
