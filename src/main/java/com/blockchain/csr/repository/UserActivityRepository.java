package com.blockchain.csr.repository;

import com.blockchain.csr.model.entity.UserActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JPA Repository for UserActivity entity
 */
@Repository
public interface UserActivityRepository extends JpaRepository<UserActivity, Integer> {
    
    /**
     * Find user activities by user ID
     *
     * @param userId the user ID
     * @return List<UserActivity>
     */
    List<UserActivity> findByUserId(Integer userId);
    
    /**
     * Find user activities by activity ID
     *
     * @param activityId the activity ID
     * @return List<UserActivity>
     */
    List<UserActivity> findByActivityId(Integer activityId);
    
    /**
     * Find user activities by state
     *
     * @param state the state
     * @return List<UserActivity>
     */
    List<UserActivity> findByState(String state);
    
    /**
     * Find user activities by user and activity
     *
     * @param userId the user ID
     * @param activityId the activity ID
     * @return List<UserActivity>
     */
    List<UserActivity> findByUserIdAndActivityId(Integer userId, Integer activityId);
    
    /**
     * Find user activities with activity and event information
     *
     * @param userId the user ID
     * @return List<Object[]> containing activity and event data
     */
    @Query("SELECT a.id, a.name, e.name, a.totalTime FROM Activity a " +
           "JOIN Event e ON a.eventId = e.id " +
           "JOIN UserActivity ua ON a.id = ua.activityId " +
           "WHERE ua.userId = :userId")
    List<Object[]> findUserActivitiesWithEventInfo(@Param("userId") Integer userId);
} 