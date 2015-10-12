// Compiled by ClojureScript 1.7.122 {}
goog.provide('hello_world.core');
goog.require('cljs.core');
goog.require('cljsjs.jquery');
cljs.core.enable_console_print_BANG_.call(null);
cljs.core.println.call(null,"Hello world!");
hello_world.core.main = (function hello_world$core$main(){
if(cljs.core.truth_($("#app"))){
return alert("#app found");
} else {
return alert("#app NOT found");
}
});
goog.exportSymbol('hello_world.core.main', hello_world.core.main);

//# sourceMappingURL=core.js.map?rel=1444684624482