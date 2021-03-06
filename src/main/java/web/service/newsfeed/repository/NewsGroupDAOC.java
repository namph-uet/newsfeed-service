package web.service.newsfeed.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import web.service.newsfeed.model.NewsGroup;

@Component
public class NewsGroupDAOC implements NewsGroupDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    public NewsGroupDAOC() {
    }

    @Override
    public NewsGroup getFirstByUserId(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        NewsGroup group = (NewsGroup) mongoTemplate.find(query, NewsGroup.class);
        return group;
    }
}
