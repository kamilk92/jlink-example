module restapi{
    exports pl.kkp.jlinkexample.restapi;

    requires spring.web;
    requires transitive spring.boot;
    requires transitive spring.boot.autoconfigure;
    requires spring.context;
}