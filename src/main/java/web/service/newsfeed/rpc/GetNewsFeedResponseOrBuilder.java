// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: newsfeed.proto

package web.service.newsfeed.rpc;

public interface GetNewsFeedResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetNewsFeedResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Post posts = 1;</code>
   */
  java.util.List<web.service.newsfeed.rpc.Post> 
      getPostsList();
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  web.service.newsfeed.rpc.Post getPosts(int index);
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  int getPostsCount();
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  java.util.List<? extends web.service.newsfeed.rpc.PostOrBuilder> 
      getPostsOrBuilderList();
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  web.service.newsfeed.rpc.PostOrBuilder getPostsOrBuilder(
      int index);
}
