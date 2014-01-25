package clojure;

import clojure.lang.*;

public final class xml_fn__6926_fn__6949_attrs__6950 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "dec");
 }
 Object atts5;
 public xml_fn__6926_fn__6949_attrs__6950(final Object atts5) {
  super();
  this.atts5 = atts5;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object i2) {
  while(true) {
   if (clojure.lang.Numbers.isNeg(((java.lang.Object)i2))) {
    return ret1;
   } else {
    java.lang.Object ret1___aux = ((IFn)const__1.getRawRoot()).invoke(ret1, ((clojure.lang.Keyword)clojure.lang.Keyword.intern((clojure.lang.Symbol)((clojure.lang.Symbol)((IFn)const__2.getRawRoot()).invoke(((java.lang.String)((org.xml.sax.Attributes)this.atts5).getQName((int)RT.intCast(i2))))))), ((java.lang.String)((org.xml.sax.Attributes)this.atts5).getValue((int)clojure.lang.RT.intCast(((java.lang.Object)i2)))));
    java.lang.Object i2___aux = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)i2)));
    ret1 = ret1___aux;
    i2 = i2___aux;
    continue;
   }
  }
 }
}
