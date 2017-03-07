package creepershift.journalparser.app;

import creepershift.elitecompaniongui.EngineerController;

/**
 * EliteCompanion
 * Created by Max on 3/7/2017.
 */
public class CommanderData {

    private String name;
    private int money;
    private String ship;
    private String shipName;
    private int combatRank;
    private int tradeRank;
    private int explorerRank;
    private int arenaRank;
    private int federationRank;
    private int empireRank;
    EngineerController controller;

    public CommanderData(EngineerController contr) {
    controller = contr;

    }

    public void setLoadGame(String name, int money, String ship, String shipName) {
        this.name = name;
        this.money = money;
        this.ship = ship;
        this.shipName = shipName;
        controller.setLabels(new String[]{name,String.valueOf(money),ship});
    }
    public void setRanks(int combatRank, int tradeRank, int explorerRank, int arenaRank, int federationRank, int empireRank){
        this.combatRank = combatRank;
        this.tradeRank = tradeRank;
        this.explorerRank = explorerRank;
        this.arenaRank = arenaRank;
        this.federationRank = federationRank;
        this.empireRank = empireRank;
    }


    public void subtractMoney(int money){

        if (this.money <= money){
            this.money -= money;
        }

    }
    public void addMoney(int money){
        this.money += money;
    }


    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getCombatRank() {
        return combatRank;
    }

    public void setCombatRank(int combatRank) {
        this.combatRank = combatRank;
    }

    public int getTradeRank() {
        return tradeRank;
    }

    public void setTradeRank(int tradeRank) {
        this.tradeRank = tradeRank;
    }

    public int getExplorerRank() {
        return explorerRank;
    }

    public void setExplorerRank(int explorerRank) {
        this.explorerRank = explorerRank;
    }

    public int getArenaRank() {
        return arenaRank;
    }

    public void setArenaRank(int arenaRank) {
        this.arenaRank = arenaRank;
    }

    public int getFederationRank() {
        return federationRank;
    }

    public void setFederationRank(int federationRank) {
        this.federationRank = federationRank;
    }

    public int getEmpireRank() {
        return empireRank;
    }

    public void setEmpireRank(int empireRank) {
        this.empireRank = empireRank;
    }
}
