package fr.polytech.team.n;

import javax.ejb.Local;

@Local
public interface ViewStatistics {
    void getSatisfactionStats();

    void getUsageStats();
}
