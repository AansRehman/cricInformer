package org.cric.apis.services;

import org.cric.apis.entities.Match;
import org.cric.apis.repositories.MatchRepo;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<Match> getAllMatches();


    List<Match> getLiveMatches();
    List<List<String>> getPointTable();
}
