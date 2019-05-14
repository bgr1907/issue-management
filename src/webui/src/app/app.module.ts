import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {AppLayoutComponent} from "./_layout/app-layout/app-layout.component";
import {FooterComponent} from "./_layout/footer/footer.component";
import {HeaderComponent} from "./_layout/header/header.component";
import {SidebarComponent} from "./_layout/sidebar/sidebar.component";
import {BsDatepickerModule, BsDropdownModule, CollapseModule, ModalModule, PaginationModule} from "ngx-bootstrap";
import {ToastNoAnimation, ToastNoAnimationModule, ToastrModule} from "ngx-toastr";
import {AppRoutingModule} from "./app-routing.module";
import {ApiService} from "./services/api.service";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {IssueService} from "./services/shared/issue.service";
import {ProjectService} from "./services/shared/project.service";
import {NgxDatatableModule} from "@swimlane/ngx-datatable";
import {TranslateHttpLoader} from "@ngx-translate/http-loader";
import {TranslateLoader, TranslateModule} from "@ngx-translate/core";

export const createTranslateLoader = ( http: HttpClient) =>{
  return new TranslateHttpLoader(http,'./assets/i18n/','.json');
}

@NgModule({
  declarations: [
    AppComponent,
    AppLayoutComponent,
    FooterComponent,
    HeaderComponent,
    SidebarComponent
  ],
  imports: [
    NgxDatatableModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    CollapseModule.forRoot(),
    BsDropdownModule.forRoot(),
    ModalModule.forRoot(),
    PaginationModule.forRoot(),
    BsDatepickerModule.forRoot(),
    ToastNoAnimationModule,
    ToastrModule.forRoot({
      toastComponent: ToastNoAnimation,
      maxOpened: 1,
      autoDismiss: true
    }),
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: createTranslateLoader,
        deps: [HttpClient]
      }
    })
  ],
  providers: [
    ApiService,
    ProjectService,
    IssueService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
