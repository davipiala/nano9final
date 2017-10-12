import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HomeComponent } from '../home/home.component';
import { LoginComponent } from '../login/login.component';
import { HistoryComponent } from '../../../modules/timeline/history/history.component';
import { AuthGuard } from '../auth/auth.guard';
import { EdificioComponent } from '../../cadastro/edificio/edificio.component';
import { FuncionariosComponent } from '../../cadastro/funcionarios/funcionarios.component';
import { MoradoresComponent } from '../../cadastro/moradores/moradores.component';
import { ManutencoesComponent } from '../../solicitacao/manutencoes/manutencoes.component'
import { ReservasComponent } from '../../solicitacao/reservas/reservas.component'
import { UsuarioComponent } from '../../cadastro/usuario/usuario.component'
import { RedeComponent } from '../../cadastro/rede/rede.component'
import { RedeWorkflow1Component } from '../../cadastro/rede/rede-workflow-1/rede-workflow-1.component'
import { RedeWorkflow2Component } from '../../cadastro/rede/rede-workflow-2/rede-workflow-2.component'
import { RedeWorkflow3Component } from '../../cadastro/rede/rede-workflow-3/rede-workflow-3.component'
import { VisitantesComponent } from '../../portaria/visitantes/visitantes.component'
import { PrestadoresComponent } from '../../portaria/prestadores/prestadores.component'
import { DadosGeraisComponent } from '../../consumo/dados-gerais/dados-gerais.component'
import { EntregasComponent } from '../../portaria/entregas/entregas.component'
import { UsuariosComponent } from '../../gestao-usuarios/usuarios/usuarios.component'
import { CaixaComponent } from '../../tesouraria/caixa/caixa.component'
import { PendenciasComponent } from '../../tesouraria/pendencias/pendencias.component'
import { RenegociacaoComponent } from '../../tesouraria/renegociacao/renegociacao.component'
import { SegViaBoletoComponent } from '../../tesouraria/seg-via-boleto/seg-via-boleto.component'



const appRoutes: Routes = [

    { path: '', pathMatch: 'full', component: HomeComponent },
    { path: 'home', component: HomeComponent },
    { path: 'login', component: LoginComponent },
    { path: 'timeline', component: HistoryComponent },
    { path: 'edificio', component: EdificioComponent },
    { path: 'funcionarios', component: FuncionariosComponent },
    { path: 'moradores', component: MoradoresComponent },
    { path: 'reservas', component: ReservasComponent },
    { path: 'manutencoes', component: ManutencoesComponent },
    { path: 'usuarios', component: UsuariosComponent },
    { path: 'redes', component: RedeComponent },
    { path: 'redesWorkflow1', component: RedeWorkflow1Component },
    { path: 'redesWorkflow2', component: RedeWorkflow2Component },
    { path: 'redesWorkflow3', component: RedeWorkflow3Component },
    { path: 'visitantes', component: VisitantesComponent },
    { path: 'prestadores', component: PrestadoresComponent },
    { path: 'dadosgerais', component: DadosGeraisComponent },
    { path: 'segundavia', component: SegViaBoletoComponent },
    { path: 'entregas', component: EntregasComponent },
    { path: 'pendencias', component: PendenciasComponent },
    { path: 'renegociacao', component: RenegociacaoComponent },
    { path: 'segundavia', component: SegViaBoletoComponent },
        { path: 'caixa', component: CaixaComponent },

    { path: '**', redirectTo: 'not-found' }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);