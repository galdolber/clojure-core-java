package clojure;

import clojure.lang.*;

public final class pprint_pretty_writer_fn__7562 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 public pprint_pretty_writer_fn__7562() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  Reflector.invokeNoArgInstanceMember(this1, "ppflush");
  return Reflector.invokeNoArgInstanceMember(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "flush");
 }
}
