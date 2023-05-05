package com.solvd.dwaine.lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Buildings {

    private String[] department;
    private String[] nameOfBuilding;
    private ArrayList<String> buildingID;

    private HashMap<String, String> buildingInfo = new HashMap<String, String>();


    public Buildings(String[] department, ArrayList<String> buildingID, String[] nameOfBuilding) {
        this.department = department;
        this.buildingID = buildingID;
        this.nameOfBuilding = nameOfBuilding;

    }

   /* public String [] getDepartment() {
        for(Buildings building: )
        return department;
    }*/

    public void setDepartment(String[] department) {
        this.department = department;
    }

    public String[] getNameOfBuilding() {
        return nameOfBuilding;
    }

    public void setNameOfBuilding(String[] nameOfBuilding) {
        this.nameOfBuilding = nameOfBuilding;
    }

    public ArrayList<String> getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(ArrayList<String> buildingID) {
        for (int i = 0; i <= buildingID.size(); ) {
            buildingInfo.put((String) buildingID.get(i), nameOfBuilding[i]);
            this.buildingID = buildingID;
        }
    }

   /* public String displayAllBuildingInfo() {
        for (int i = 0; i <= buildingID.size(); ) {
            System.out.println(buildingInfo);
    }
        return buildingInfo;
}*/

    public String displayBuildingInfo(String buildingNum) {
        String bName = null;
        String id = null;
        if (buildingInfo.containsKey(buildingNum))
            for (Map.Entry<String, String> entry : buildingInfo.entrySet()) {
                id = entry.getKey();
                bName = entry.getValue();

            }
        return "Building ID: " + id + " " + "Building Name: " + bName;
    }
}