package clojure;

import clojure.lang.*;

public class core_proxy__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.asm.ClassWriter.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.asm.ClassVisitor.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.asm.Opcodes.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.asm.Type.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(java.lang.reflect.Modifier.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(java.lang.reflect.Constructor.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.asm.commons.Method.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.asm.commons.GeneratorAdapter.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.Var.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.IProxy.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.Reflector.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.DynamicClassLoader.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.Compiler.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.IPersistentMap.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.PersistentHashMap.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.RT.class);
  const__2.setMeta((IPersistentMap)const__10);
  const__2.bindRoot(new clojure.core_method_sig());
  const__11.setMeta((IPersistentMap)const__15);
  const__11.bindRoot(new clojure.core_most_specific());
  const__16.setMeta((IPersistentMap)const__20);
  const__16.bindRoot(new clojure.core_group_by_sig());
  const__21.setMeta((IPersistentMap)const__26);
  const__21.bindRoot(new clojure.core_proxy_name());
  const__27.setMeta((IPersistentMap)const__30);
  const__27.bindRoot(new clojure.core_generate_proxy());
  const__31.setMeta((IPersistentMap)const__34);
  const__31.bindRoot(new clojure.core_get_super_and_interfaces());
  const__35.setMeta((IPersistentMap)const__39);
  const__35.bindRoot(new clojure.core_get_proxy_class());
  const__40.setMeta((IPersistentMap)const__43);
  const__40.bindRoot(new clojure.core_construct_proxy());
  const__44.setMeta((IPersistentMap)const__47);
  const__44.bindRoot(new clojure.core_init_proxy());
  const__48.setMeta((IPersistentMap)const__51);
  const__48.bindRoot(new clojure.core_update_proxy());
  const__52.setMeta((IPersistentMap)const__55);
  const__52.bindRoot(new clojure.core_proxy_mappings());
  const__56.setMeta((IPersistentMap)const__59);
  const__56.bindRoot(new clojure.core_proxy());
  ((clojure.lang.Var)const__56).setMacro();
  const__60.setMeta((IPersistentMap)const__63);
  const__60.bindRoot(new clojure.core_proxy_call_with_super());
  const__64.setMeta((IPersistentMap)const__67);
  const__64.bindRoot(new clojure.core_proxy_super());
  ((clojure.lang.Var)const__64).setMacro();
 }
 private static clojure.lang.Var const__0;
 private static clojure.lang.Symbol const__1;
 private static clojure.lang.Var const__2;
 private static clojure.lang.Keyword const__3;
 private static clojure.lang.Keyword const__4;
 private static java.lang.Integer const__5;
 private static clojure.lang.Keyword const__6;
 private static java.lang.Integer const__7;
 private static clojure.lang.Keyword const__8;
 private static clojure.lang.IPersistentList const__9;
 private static clojure.lang.IPersistentMap const__10;
 private static clojure.lang.Var const__11;
 private static java.lang.Integer const__12;
 private static clojure.lang.IPersistentList const__13;
 private static clojure.lang.Keyword const__14;
 private static clojure.lang.IPersistentMap const__15;
 private static clojure.lang.Var const__16;
 private static java.lang.Integer const__17;
 private static clojure.lang.IPersistentList const__18;
 private static clojure.lang.Keyword const__19;
 private static clojure.lang.IPersistentMap const__20;
 private static clojure.lang.Var const__21;
 private static java.lang.Integer const__22;
 private static clojure.lang.IPersistentList const__23;
 private static clojure.lang.Keyword const__24;
 private static java.lang.Class const__25;
 private static clojure.lang.IPersistentMap const__26;
 private static clojure.lang.Var const__27;
 private static java.lang.Integer const__28;
 private static clojure.lang.IPersistentList const__29;
 private static clojure.lang.IPersistentMap const__30;
 private static clojure.lang.Var const__31;
 private static java.lang.Integer const__32;
 private static clojure.lang.IPersistentList const__33;
 private static clojure.lang.IPersistentMap const__34;
 private static clojure.lang.Var const__35;
 private static java.lang.Integer const__36;
 private static clojure.lang.IPersistentList const__37;
 private static clojure.lang.Keyword const__38;
 private static clojure.lang.IPersistentMap const__39;
 private static clojure.lang.Var const__40;
 private static java.lang.Integer const__41;
 private static clojure.lang.IPersistentList const__42;
 private static clojure.lang.IPersistentMap const__43;
 private static clojure.lang.Var const__44;
 private static java.lang.Integer const__45;
 private static clojure.lang.IPersistentList const__46;
 private static clojure.lang.IPersistentMap const__47;
 private static clojure.lang.Var const__48;
 private static java.lang.Integer const__49;
 private static clojure.lang.IPersistentList const__50;
 private static clojure.lang.IPersistentMap const__51;
 private static clojure.lang.Var const__52;
 private static java.lang.Integer const__53;
 private static clojure.lang.IPersistentList const__54;
 private static clojure.lang.IPersistentMap const__55;
 private static clojure.lang.Var const__56;
 private static java.lang.Integer const__57;
 private static clojure.lang.IPersistentList const__58;
 private static clojure.lang.IPersistentMap const__59;
 private static clojure.lang.Var const__60;
 private static java.lang.Integer const__61;
 private static clojure.lang.IPersistentList const__62;
 private static clojure.lang.IPersistentMap const__63;
 private static clojure.lang.Var const__64;
 private static java.lang.Integer const__65;
 private static clojure.lang.IPersistentList const__66;
 private static clojure.lang.IPersistentMap const__67;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "method-sig");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__5 = (java.lang.Integer)1;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__7 = (java.lang.Integer)19;
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__9 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "meth")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "java.lang.reflect.Method"))))));
  const__10 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "meth")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "java.lang.reflect.Method")))))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 19, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "most-specific");
  const__12 = (java.lang.Integer)22;
  const__13 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "rtypes"))));
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__15 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "rtypes")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 22, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "group-by-sig");
  const__17 = (java.lang.Integer)26;
  const__18 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "coll"))));
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__20 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "coll")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "doc"), "takes a collection of [msig meth] and returns a seq of maps from return-types to meths.", Keyword.intern(null, "line"), 26, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "proxy-name");
  const__22 = (java.lang.Integer)35;
  const__23 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "super")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Class"))), Symbol.intern(null, "interfaces"))));
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__25 = (java.lang.Class)java.lang.String.class;
  const__26 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "super")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Class"))), Symbol.intern(null, "interfaces")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 35, Keyword.intern(null, "file"), "clojure/core_proxy.clj", Keyword.intern(null, "tag"), java.lang.String.class);
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "generate-proxy");
  const__28 = (java.lang.Integer)46;
  const__29 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "super")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Class"))), Symbol.intern(null, "interfaces"))));
  const__30 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "super")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Class"))), Symbol.intern(null, "interfaces")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 46, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "get-super-and-interfaces");
  const__32 = (java.lang.Integer)330;
  const__33 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "bases"))));
  const__34 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "bases")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 330, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__35 = (clojure.lang.Var)RT.var("clojure.core", "get-proxy-class");
  const__36 = (java.lang.Integer)335;
  const__37 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "&"), Symbol.intern(null, "bases"))));
  const__38 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__39 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "&"), Symbol.intern(null, "bases")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Takes an optional single class followed by zero or more\n  interfaces. If not supplied class defaults to Object.  Creates an\n  returns an instance of a proxy class derived from the supplied\n  classes. The resulting value is cached and used for any subsequent\n  requests for the same class set. Returns a Class object.", Keyword.intern(null, "line"), 335, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__40 = (clojure.lang.Var)RT.var("clojure.core", "construct-proxy");
  const__41 = (java.lang.Integer)349;
  const__42 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "c"), Symbol.intern(null, "&"), Symbol.intern(null, "ctor-args"))));
  const__43 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "c"), Symbol.intern(null, "&"), Symbol.intern(null, "ctor-args")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Takes a proxy class and any arguments for its superclass ctor and\n  creates and returns an instance of the proxy.", Keyword.intern(null, "line"), 349, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__44 = (clojure.lang.Var)RT.var("clojure.core", "init-proxy");
  const__45 = (java.lang.Integer)356;
  const__46 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "proxy")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "IProxy"))), Symbol.intern(null, "mappings"))));
  const__47 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "proxy")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "IProxy"))), Symbol.intern(null, "mappings")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Takes a proxy instance and a map of strings (which must\n  correspond to methods of the proxy superclass/superinterfaces) to\n  fns (which must take arguments matching the corresponding method,\n  plus an additional (explicit) first arg corresponding to this, and\n  sets the proxy's fn map.  Returns the proxy.", Keyword.intern(null, "line"), 356, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__48 = (clojure.lang.Var)RT.var("clojure.core", "update-proxy");
  const__49 = (java.lang.Integer)367;
  const__50 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "proxy")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "IProxy"))), Symbol.intern(null, "mappings"))));
  const__51 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "proxy")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "IProxy"))), Symbol.intern(null, "mappings")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Takes a proxy instance and a map of strings (which must\n  correspond to methods of the proxy superclass/superinterfaces) to\n  fns (which must take arguments matching the corresponding method,\n  plus an additional (explicit) first arg corresponding to this, and\n  updates (via assoc) the proxy's fn map. nil can be passed instead of\n  a fn, in which case the corresponding method will revert to the\n  default behavior. Note that this function can be used to update the\n  behavior of an existing instance without changing its identity.\n  Returns the proxy.", Keyword.intern(null, "line"), 367, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__52 = (clojure.lang.Var)RT.var("clojure.core", "proxy-mappings");
  const__53 = (java.lang.Integer)382;
  const__54 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "proxy")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "IProxy"))))));
  const__55 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "proxy")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "IProxy")))))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Takes a proxy instance and returns the proxy's fn map.", Keyword.intern(null, "line"), 382, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__56 = (clojure.lang.Var)RT.var("clojure.core", "proxy");
  const__57 = (java.lang.Integer)388;
  const__58 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "class-and-interfaces"), Symbol.intern(null, "args"), Symbol.intern(null, "&"), Symbol.intern(null, "fs"))));
  const__59 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "class-and-interfaces"), Symbol.intern(null, "args"), Symbol.intern(null, "&"), Symbol.intern(null, "fs")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "class-and-interfaces - a vector of class names\n\n  args - a (possibly empty) vector of arguments to the superclass\n  constructor.\n\n  f => (name [params*] body) or\n  (name ([params*] body) ([params+] body) ...)\n\n  Expands to code which creates a instance of a proxy class that\n  implements the named class/interface(s) by calling the supplied\n  fns. A single class, if provided, must be first. If not provided it\n  defaults to Object.\n\n  The interfaces names must be valid interface types. If a method fn\n  is not provided for a class method, the superclass methd will be\n  called. If a method fn is not provided for an interface method, an\n  UnsupportedOperationException will be thrown should it be\n  called. Method fns are closures and can capture the environment in\n  which proxy is called. Each method fn takes an additional implicit\n  first arg, which is bound to 'this. Note that while method fns can\n  be provided to override protected methods, they have no other access\n  to protected members, nor to super, as these capabilities cannot be\n  proxied.", Keyword.intern(null, "line"), 388, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__60 = (clojure.lang.Var)RT.var("clojure.core", "proxy-call-with-super");
  const__61 = (java.lang.Integer)443;
  const__62 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "call"), Symbol.intern(null, "this"), Symbol.intern(null, "meth"))));
  const__63 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "call"), Symbol.intern(null, "this"), Symbol.intern(null, "meth")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 443, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
  const__64 = (clojure.lang.Var)RT.var("clojure.core", "proxy-super");
  const__65 = (java.lang.Integer)450;
  const__66 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "meth"), Symbol.intern(null, "&"), Symbol.intern(null, "args"))));
  const__67 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "meth"), Symbol.intern(null, "&"), Symbol.intern(null, "args")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Use to call a superclass method in the body of a proxy method.\n  Note, expansion captures 'this", Keyword.intern(null, "line"), 450, Keyword.intern(null, "file"), "clojure/core_proxy.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.core_proxy__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
