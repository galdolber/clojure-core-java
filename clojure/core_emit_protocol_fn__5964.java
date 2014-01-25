package clojure;

import clojure.lang.*;

public final class core_emit_protocol_fn__5964 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Symbol const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "on");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "on-interface");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "nnext");
 }
 Object opts_PLUS_sigs2;
 Object iname3;
 public core_emit_protocol_fn__5964(final Object opts_PLUS_sigs2, final Object iname3) {
  super();
  this.opts_PLUS_sigs2 = opts_PLUS_sigs2;
  this.iname3 = iname3;
 }
 public java.lang.Object invoke() {
  {
   Object opts1 = RT.mapUniqueKeys(const__0, ((IFn)const__1.getRawRoot()).invoke(const__2, this.iname3), const__3, this.iname3);
   Object sigs2 = this.opts_PLUS_sigs2;
   while(true) {
    {
     Object pred__59653 = new clojure.core_emit_protocol_fn__5964_pred__5965__5968();
     Object expr__59664 = ((IFn)const__4.getRawRoot()).invoke(sigs2);
     Object __r3804 = ((IFn)pred__59653).invoke(const__5.getRawRoot(), expr__59664);
     if (__r3804 != null && !(__r3804 == Boolean.FALSE)) {
      java.lang.Object opts1___aux = ((IFn)const__6.getRawRoot()).invoke(opts1, const__7, ((IFn)const__4.getRawRoot()).invoke(sigs2));
      java.lang.Object sigs2___aux = ((IFn)const__8.getRawRoot()).invoke(sigs2);
      opts1 = opts1___aux;
      sigs2 = sigs2___aux;
      continue;
     } else {
      Object __r3806 = ((IFn)pred__59653).invoke(const__9.getRawRoot(), expr__59664);
      if (__r3806 != null && !(__r3806 == Boolean.FALSE)) {
       java.lang.Object opts1___aux = ((IFn)const__6.getRawRoot()).invoke(opts1, ((IFn)const__4.getRawRoot()).invoke(sigs2), ((IFn)const__10.getRawRoot()).invoke(sigs2));
       java.lang.Object sigs2___aux = ((IFn)const__11.getRawRoot()).invoke(sigs2);
       opts1 = opts1___aux;
       sigs2 = sigs2___aux;
       continue;
      } else {
       return RT.vector(opts1, sigs2);
      }
     }
    }
   }
  }
 }
}
