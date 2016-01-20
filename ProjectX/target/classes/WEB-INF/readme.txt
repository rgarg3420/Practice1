Pointers for Internationalization i18n

1. annotation-driven tag enables the Controller programming model, 
   without it Spring won’t recognize our HomeController as handler for client requests.
   
2. context:component-scan provides the package where Spring will look for the annotated components and 
   register them automatically as Spring bean.
   
3. messageSource bean is configured to enable i18n for our application.
   basename property is used to provide the location of resource bundles. 
   classpath:messages means that resource bundles are located in the classpath and 
   follows name pattern as messages_{locale}.properties. 
   defaultEncoding property is used to define the encoding used for the messages.
   
4. localeResolver bean of type org.springframework.web.servlet.i18n.CookieLocaleResolver is used to set a cookie 
   in the client request so that further requests can easily recognize the user locale. 
   For example, we can ask user to select the locale when he launches the web application 
   for the first time and with the use of cookie, we can identify the user locale and automatically send 
   locale specific response. We can also specify the default locale, 
   cookie name and maximum age of the cookie before it gets expired and deleted by the client browser.
   If your application maintains user sessions, 
   then you can also use org.springframework.web.servlet.i18n.SessionLocaleResolver as localeResolver 
   to use a locale attribute in the user’s session. The configuration is similar to CookieLocaleResolver.
   If we don’t register any “localeResolver”, AcceptHeaderLocaleResolver will be used by default, 
   which resolves user locale by checking the accept-language header in the client HTTP request.

5. org.springframework.web.servlet.i18n.LocaleChangeInterceptor interceptor is configured 
   to intercept the user request and identify the user locale. 
   The parameter name is configurable and we are using request parameter name for locale as “locale”. 
   Without this interceptor, we won’t be able to change the user locale and send the response based on the 
   new locale settings of the user. It needs to be part of interceptors element otherwise 
   Spring won’t configure it as an interceptor.
   
   
   
   JUNIT TEST CASE SAMPLE:
   /*@Test
public void findAll_TodosFound_ShouldReturnFoundTodoEntries() throws Exception {
    Todo first = new TodoBuilder()
            .id(1L)
            .description("Lorem ipsum")
            .title("Foo")
            .build();
    Todo second = new TodoBuilder()
            .id(2L)
            .description("Lorem ipsum")
            .title("Bar")
            .build();

    when(todoServiceMock.findAll()).thenReturn(Arrays.asList(first, second));

    mockMvc.perform(get("/api/todo"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$", hasSize(2)))
            .andExpect(jsonPath("$[0].id", is(1)))
            .andExpect(jsonPath("$[0].description", is("Lorem ipsum")))
            .andExpect(jsonPath("$[0].title", is("Foo")))
            .andExpect(jsonPath("$[1].id", is(2)))
            .andExpect(jsonPath("$[1].description", is("Lorem ipsum")))
            .andExpect(jsonPath("$[1].title", is("Bar")));

    verify(todoServiceMock, times(1)).findAll();
    verifyNoMoreInteractions(todoServiceMock);
}*/
   
   
  XML content :
  @XmlRootElement:This annotation defines root element of XML file.
@XmlType(propOrder = {‘list of attributes in order’}):This is used to define order of elements in XML file.This is optional.
@XmlElement:This is used to define element in XML file.It sets name of entity.
@XmlElementWrapper(name = ‘name to be given to that wrapper’):It generates a wrapper element around XML representation.E.g.In above example, it will generate <stateList>
around each <state> element 


Creating java class from xsd using xjc.exe .
 this java class file can be used to create xml files using marsheller and then java objects.  
   
   