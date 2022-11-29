package io.security.oauth2.springsecurityoauth2;

import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizationRequestResolver;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;

import javax.servlet.http.HttpServletRequest;

public class CustomOAuth2AuthorizationRequestResolver implements OAuth2AuthorizationRequestResolver {

    private ClientRegistrationRepository clientRegistrationRepository;
    private String baseUri;


    public CustomOAuth2AuthorizationRequestResolver(ClientRegistrationRepository clientRegistrationRepository, String baseUri) {
        this.clientRegistrationRepository = clientRegistrationRepository;
        this.baseUri = baseUri;
    }

    @Override
    public OAuth2AuthorizationRequest resolve(HttpServletRequest request) {
        return null;
    }

    @Override
    public OAuth2AuthorizationRequest resolve(HttpServletRequest request, String clientRegistrationId) {
        return null;
    }
}
