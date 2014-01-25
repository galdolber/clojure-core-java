package clojure;

import clojure.lang.*;

public final class pprint_capitalize_word_writer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ref");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "init-proxy");
 }
 public pprint_capitalize_word_writer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object writer1) {
  {
   Object last_was_whitespace_QMARK_2 = ((IFn)const__0.getRawRoot()).invoke(Boolean.TRUE);
   {
    Object p__5329__auto__3 = new clojure.pprint.proxy$java.io.Writer$0();
    ((IFn)const__1.getRawRoot()).invoke(p__5329__auto__3, RT.mapUniqueKeys("write", new clojure.pprint_capitalize_word_writer_fn__7885(writer1, last_was_whitespace_QMARK_2), "flush", new clojure.pprint_capitalize_word_writer_fn__7894(writer1), "close", new clojure.pprint_capitalize_word_writer_fn__7896(writer1)));
    return p__5329__auto__3;
   }
  }
 }
}
